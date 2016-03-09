package org.bildit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("mobilniDao")
public class MobilniDAO {
	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Mobilni> getMobilni() {
		return jdbc.query("SELECT * FROM mobilni", new RowMapper<Mobilni>() {

			@Override
			public Mobilni mapRow(ResultSet rs, int rowNum) throws SQLException {
				Mobilni mobilni = new Mobilni();
				mobilni.setId(rs.getInt("id"));
				mobilni.setModel(rs.getString("model"));
				mobilni.setProcesor(rs.getString("procesor"));
				mobilni.setRam(rs.getString("ram"));
				mobilni.setCijena(rs.getString("cijena"));
				return mobilni;
			}

		});
	}

	public boolean delete(int id) {
		MapSqlParameterSource params = new MapSqlParameterSource("id", id);
		return jdbc.update("DELETE FROM mobilni WHERE id=:id", params) == 1;

	}

	public boolean create(Mobilni mobilni) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(mobilni);
		return jdbc.update("INSERT INTO mobilni (model,procesor, ram,cijena) VALUES (:model, :procesor,:ram,:cijena)",
				params) == 1;
	}

	public List<Mobilni> searchMobilni(String term) {
		String search = "SELECT * FROM mobilni where id='" + term + "' OR model LIKE'%" + term + "%' OR cijena='" + term+"'";
		return jdbc.query(search, new RowMapper<Mobilni>() {

			@Override
			public Mobilni mapRow(ResultSet rs, int rowNum) throws SQLException {
				Mobilni mobilni = new Mobilni();
				mobilni.setId(rs.getInt("id"));
				mobilni.setModel(rs.getString("model"));
				mobilni.setProcesor(rs.getString("procesor"));
				mobilni.setRam(rs.getString("ram"));
				mobilni.setCijena(rs.getString("cijena"));
				return mobilni;
			}

		});

	}
}
