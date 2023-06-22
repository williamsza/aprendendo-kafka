package br.com.williamsouza.producer.producer.resource;

import br.com.williamsouza.producer.producer.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagem")
public class MensagemResource {
@Autowired
MensagemService mensagemService;

@PostMapping
    public ResponseEntity<String> enviarMensagem(@RequestBody String mensagem){
    mensagemService.sendMessage(mensagem);
    return ResponseEntity.ok().body("Menssagem enviada com sucesso!"+ mensagem);
}



}
