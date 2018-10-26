package br.com.cervejeiros.conf;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.cervejeiros.model.dao.EnderecoDao;
import br.com.cervejeiros.model.dao.ForumCervejasDao;
import br.com.cervejeiros.model.dao.ForumCervejasMsgDao;
import br.com.cervejeiros.model.dao.ForumEventosDao;
import br.com.cervejeiros.model.dao.ForumEventosMsgDao;
import br.com.cervejeiros.model.dao.ForumLancesDao;
import br.com.cervejeiros.model.dao.ForumLancesMsgDao;
import br.com.cervejeiros.model.dao.PessoaDao;
import br.com.cervejeiros.web.Inicial;


@EnableWebMvc
@ComponentScan(basePackageClasses = {Inicial.class, EnderecoDao.class, ForumCervejasDao.class, ForumCervejasMsgDao.class, ForumEventosDao.class, ForumEventosMsgDao.class, ForumLancesDao.class, ForumLancesMsgDao.class, PessoaDao.class  })
public class AppWebConfiguration {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	public MessageSource messageSource() {

		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("/WEB-INF/messages");
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setCacheSeconds(1);
		return messageSource;
	}

	@Bean
	public FormattingConversionService conversionService() {
		DefaultFormattingConversionService service = new DefaultFormattingConversionService();

		DateFormatterRegistrar formatter = new DateFormatterRegistrar();
		formatter.setFormatter(new DateFormatter("dd/MM/yyyy"));
		formatter.registerFormatters(service);

		return service;

	}

	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}
}
