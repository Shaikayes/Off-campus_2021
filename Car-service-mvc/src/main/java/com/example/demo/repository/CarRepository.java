package com.example.demo.repository;

    import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.jdbc.core.BeanPropertyRowMapper;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
	import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
	import org.springframework.stereotype.Repository;
	import com.example.demo.model.Car;
	import java.util.*;
	@Repository
	public class CarRepository {

	
		@Autowired
		private JdbcTemplate template;
		
       public int addCar(Car entity) {
			
			SimpleJdbcInsert inserter = new SimpleJdbcInsert(template);
			
			inserter.withTableName("car").usingColumns("model", "yearofmanufacture","kilometers","status","brandName");
			
			BeanPropertySqlParameterSource sql = new BeanPropertySqlParameterSource(entity);
			
			return inserter.execute(sql);
		}

		public List<Car> getAllCars(){
			
			String sql= "select * from car";
			
			List<Car> custList =
					template.query(sql,  BeanPropertyRowMapper.newInstance(Car.class));
			
			return custList;
			
		}
      public List<Car> getBrandName(){
			
			String sql= "select * from car where status='unsold'";
			
			List<Car> custList =
					template.query(sql,  BeanPropertyRowMapper.newInstance(Car.class));
			
			return custList;
			
		}
      public List<Car> getCarsByBrand(String brand)
      {
    	  String sql= "select * from car where brand=?";
    	  
    	  List<Car> cars =
					template.query(sql, new Object[] {brand}, new BeanPropertyRowMapper<>(Car.class));
    	  return cars;
    	  
      }

	
      
      public String[] getBrand() {
    	  String sql= "select distinct(brandname) from car";
    	  List<String> custList =
					template.queryForList(sql, String.class);
    	  
    	  String[] brands=custList.toArray(new String[custList.size()]);
    	  
    	  return brands;
    	   
      }

	

		
	}

