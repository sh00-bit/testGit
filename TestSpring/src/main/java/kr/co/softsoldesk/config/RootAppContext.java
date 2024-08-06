package kr.co.softsoldesk.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.context.annotation.SessionScope;

import kr.co.softsoldesk.mapper.BoardMapper;
import kr.co.softsoldesk.mapper.GoodsMapper;
import kr.co.softsoldesk.mapper.MemberMapper;


@Configuration//스프링 컨테이너
@ComponentScan("kr.co.softsoldesk.service")
@ComponentScan("kr.co.softsoldesk.DAO")
@PropertySource("/WEB-INF/properties/db.properties")
public class RootAppContext {
//프로젝트 작업 시 사용할 bean을 관리하는 클래스
	
	@Value("${db.classname}")
	private String db_classname;
	
	@Value("${db.url}")
	private String db_url;
	
	@Value("${db.username}")
	private String db_username;
	
	@Value("${db.password}")
	private String db_password;

	//데이터베이스 접속정보 관리 Bean
	@Bean
	public BasicDataSource dataSource() {
		
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName(db_classname);
		source.setUrl(db_url);
		source.setUsername(db_username);
		source.setPassword(db_password);
		
		return source;
		
	}
	//쿼리문과 접속정보를 관리 Bean
	@Bean
	public SqlSessionFactory factory(BasicDataSource souce) throws Exception {
		
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(souce);
		SqlSessionFactory factory = factoryBean.getObject();
		
		return factory;
	}

	@Bean
	public MapperFactoryBean<MemberMapper> getStudentMapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<MemberMapper> factoryBean = new MapperFactoryBean<MemberMapper>(MemberMapper.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
	@Bean
	public MapperFactoryBean<GoodsMapper> getGoodsMapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<GoodsMapper> factoryBean = new MapperFactoryBean<GoodsMapper>(GoodsMapper.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
	@Bean
	public MapperFactoryBean<BoardMapper> getBoardMapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<BoardMapper> factoryBean = new MapperFactoryBean<BoardMapper>(BoardMapper.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
}
