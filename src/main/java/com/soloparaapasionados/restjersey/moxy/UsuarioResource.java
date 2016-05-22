/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soloparaapasionados.restjersey.moxy;

import com.soloparaapasioandos.capitulo019.web.dao.ItemDAO;
import com.soloparaapasionados.restjersey.compartido.Flower;
import com.soloparaapasionados.restjersey.compartido.Meta;
import com.soloparaapasionados.restjersey.compartido.MetaResonse;
import com.soloparaapasionados.restjersey.compartido.Person;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.soloparaapasionados.restjersey.compartido.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.PathParam;

/**
 *
 * @author USUARIO
 */
@Path("/usuarioRecurso")
public class UsuarioResource {
    @Inject
    ItemDAO itemDAO;
 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario createSimpleBean() {
        return new Usuario(100, "Yerico");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getFlowers")
    public List<Flower> createFlowerBean() {
        List<Flower> flowerList = new ArrayList<>();

        Flower flower = new Flower();

        flower.setProductId(1);
        flower.setName("Azalea");
        flower.setCategory("Shrubs");
        flower.setInstructions("Large double. Good grower, heavy bloomer. Early to mid-season, acid loving plants. Plant in moist well drained soil with pH of 4.0-5.5.");
        flower.setPhoto("california_snow.jpg");
        flower.setPrice(15.99);
        flowerList.add(flower);

        Flower flower2 = new Flower();
        flower2.setProductId(2);
        flower2.setName("Tibouchina Semidecandra");
        flower2.setCategory("Shrubs");
        flower2.setInstructions("Beautiful large royal purple flowers adorn attractive satiny green leaves that turn orange\\/red in cold weather. Grows to up to 18 feet, or prune annually to shorten.");
        flower2.setPhoto("princess_flower.jpg");
        flower2.setPrice(33.99);
        flowerList.add(flower2);

        Flower flower3 = new Flower();
        flower3.setProductId(3);
        flower3.setName("Hibiscus");
        flower3.setCategory("Shrubs");
        flower3.setInstructions("Blooms in summer, 20-35 inches high. Fertilize regularly for best results. Full sun, drought tolerant.");
        flower3.setPhoto("haight_ashbury.jpg");
        flower3.setPrice(12.99);
        flowerList.add(flower3);

        Flower flower4 = new Flower();
        flower4.setProductId(4);
        flower4.setName("Plectranthus");
        flower4.setCategory("Shrubs");
        flower4.setInstructions("Quick-growing, herbaceous, shrub reaching up to 30 inches in height, forming a rounded, dense bush.");
        flower4.setPhoto("mona_lavender.jpg");
        flower4.setPrice(5.99);
        flowerList.add(flower4);

        Flower flower5 = new Flower();
        flower5.setProductId(5);
        flower5.setName("Camellia Japonica");
        flower5.setCategory("Shrubs");
        flower5.setInstructions("Slow growing, upright to spreading shrub. Oval, glossy, leaves and profuse winter to spring blooming flowers.");
        flower5.setPhoto("camellia.jpg");
        flower5.setPrice(15.99);
        flowerList.add(flower5);


        return flowerList;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getPeople")
    public List<Person> createPersonBean() {
        List<Person> PersonList = new ArrayList<>();

        PersonList = new ArrayList<>();
        PersonList.add(new Person("Steve", "Jobs", "uy0qrr6x1r5aizq/steve_jobs.png",
                "Steve Jobs met Steve Wozniak while in high school and in 1976, they started Apple Computers. Jobs oversaw the development of revolutionary products like the iPhone and iPad."));
        PersonList.add(new Person("Steve", "Wozniak", "fmcwn6jgr6wobh5/steve_wozniak.png",
                "Steve Wozniak is the co-founder of Apple Computers. Wozniak has always been credited with being the main designer of the first Apples."));
        PersonList.add(new Person("Bill", "Gates", "wzfrnd7g39241w0/bill_gates-web.png", 
                "Bill Gates and his partner Paul Allen built the world's largest software business, Microsoft."));
        PersonList.add(new Person("Mark", "Zuckerberg","u4r3182l9w24fjc/mark_zuckerberg.png?",
                "Mark Zuckerberg was the Harvard computer science student who along with a few friends launched the world's most popular social networking website called Facebook in February 2004."));
        PersonList.add(new Person("Larry", "Page","zl59hlzbiuc3sto/larry_page.png?",
                "Mark Zuckerberg was the Harvard computer science student who along with a few friends launched the world's most popular social networking website called Facebook in February 2004."));
        PersonList.add(new Person("Sergey", "Brin","06avtnfcqxsegxw/sergey_brin.png?",
                "Mark Zuckerberg was the Harvard computer science student who along with a few friends launched the world's most popular social networking website called Facebook in February 2004."));
  /*PersonList.add(new Person("Steve", "Jobs", "uy0qrr6x1r5aizq/steve_jobs.png?dl=0",
                "Steve Jobs met Steve Wozniak while in high school and in 1976, they started Apple Computers. Jobs oversaw the development of revolutionary products like the iPhone and iPad."));
        PersonList.add(new Person("Steve", "Wozniak", "fmcwn6jgr6wobh5/steve_wozniak.png?dl=0",
                "Steve Wozniak is the co-founder of Apple Computers. Wozniak has always been credited with being the main designer of the first Apples."));
        PersonList.add(new Person("Bill", "Gates", "wzfrnd7g39241w0/bill_gates-web.png?dl=0", 
                "Bill Gates and his partner Paul Allen built the world's largest software business, Microsoft."));
        PersonList.add(new Person("Mark", "Zuckerberg","u4r3182l9w24fjc/mark_zuckerberg.png?dl=0",
                "Mark Zuckerberg was the Harvard computer science student who along with a few friends launched the world's most popular social networking website called Facebook in February 2004."));
        PersonList.add(new Person("Larry", "Page","zl59hlzbiuc3sto/larry_page.png?dl=0",
                "Mark Zuckerberg was the Harvard computer science student who along with a few friends launched the world's most popular social networking website called Facebook in February 2004."));
        PersonList.add(new Person("Sergey", "Brin","06avtnfcqxsegxw/sergey_brin.png?dl=0",
                "Mark Zuckerberg was the Harvard computer science student who along with a few friends launched the world's most popular social networking website called Facebook in February 2004."));
*/
        return PersonList;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/metas")
    public MetaResonse getMetas() {
        MetaResonse metaResonse =new MetaResonse();
        List<Meta> metaList = new ArrayList<>();
        
        //Item item = itemDAO.findById(id);
        //if (item == null)
            //throw new WebApplicationException(NOT_FOUND);
        //return item;
        
       // metaList = new ArrayList<>();
       // metaList.add(new Meta("1", "Comprar Mazda 6", "Deseo adquirir un auto mazda 6 ", "Media", "2015-11-20", "Material"));
       // metaList.add(new Meta("2", "Obtener mi título de ingeniería de sistemas", "Ya solo faltan 2 semestres para terminar mi carrera de ingeniería", "Alta", "2016-06-17", "Profesional"));
       // metaList.add(new Meta("3", "Conquistar a Natasha", "Natasha es la mujer de vida. Tengo que decírselo antes de que acabe el semestre", "Alta", "2015-05-25", "Espiritual"));
       // metaList.add(new Meta("4", "Tener un peso de 70kg", "Actualmente peso 92kg y estoy en sobrepeso. Sin embargo voy a seguir una rutina de ejercicios y un régimen alimenticio", "Baja", "2016-05-13", "Salud"));
       // metaList.add(new Meta("5", "Incrementar un 30% mis ingresos", "Conseguiré una fuente de ingresos alternativa que representen un 30% de los ingresos que recibo actualmente.", "Media", "2015-10-13", "Finanzas"));
       
        metaResonse.estado="1";
        metaResonse.metas=metaList;
        
        return metaResonse;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/metas/{metaId}")
    public List<Meta> getMetasByID(@PathParam("metaId") String metaId) {
        List<Meta> metaList = new ArrayList<>();
        
        metaList = new ArrayList<>();
        metaList.add(new Meta(null, "Incrementar un 30% mis ingresos", "Conseguiré una fuente de ingresos alternativa que representen un 30% de los ingresos que recibo actualmente.", "Media", "2015-10-13", "Finanzas"));
       
        return metaList;
    }
    
    

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Usuario roundTrip(Usuario user) {
        return user;
    }
}
