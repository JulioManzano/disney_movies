package com.kclick;

import com.kclick.models.UsuarioModel;
import com.kclick.repositories.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class DisneyMoviesApplicationTests {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private BCryptPasswordEncoder encoder;
	@Test
	void crearUsuarioTest() {
		UsuarioModel user = new UsuarioModel();
		user.setId(2);
		user.setClave(encoder.encode("1234"));
		user.setNombre("Juan");
		UsuarioModel result = usuarioRepository.save(user);

		assert (result.getClave().equalsIgnoreCase(user.getClave()));

	}

}
