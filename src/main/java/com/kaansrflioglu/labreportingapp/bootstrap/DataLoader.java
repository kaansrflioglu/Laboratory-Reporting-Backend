package com.kaansrflioglu.labreportingapp.bootstrap;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kaansrflioglu.labreportingapp.entities.Cities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Component
public class DataLoader implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public DataLoader(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        List<String> cityNames = Arrays.asList(
            "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Amasya",
            "Ankara", "Antalya", "Artvin", "Aydın", "Balıkesir",
            "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur",
            "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli",
            "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum",
            "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkari",
            "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir",
            "Kars", "Kastamonu", "Kayseri", "Kırklareli", "Kırşehir",
            "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
            "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir",
            "Niğde", "Ordu", "Rize", "Sakarya", "Samsun",
            "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat",
            "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van",
            "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman",
            "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan",
            "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"
        );

        List<Integer> cityPlateCodes = Arrays.asList(
            1, 2, 3, 4, 5,
            6, 7, 8, 9, 10,
            11, 12, 13, 14, 15,
            16, 17, 18, 19, 20,
            21, 22, 23, 24, 25,
            26, 27, 28, 29, 30,
            31, 32, 33, 34, 35,
            36, 37, 38, 39, 40,
            41, 42, 43, 44, 45,
            46, 47, 48, 49, 50,
            51, 52, 53, 54, 55,
            56, 57, 58, 59, 60,
            61, 62, 63, 64, 65,
            66, 67, 68, 69, 70,
            71, 72, 73, 74, 75,
            76, 77, 78, 79, 80,
            81
        );

        for (int i = 0; i < cityNames.size(); i++) {
            String cityName = cityNames.get(i);
            int cityPlateCode = cityPlateCodes.get(i);

            Query query = entityManager.createQuery("SELECT COUNT(c) FROM Cities c WHERE c.name = :cityName");
            query.setParameter("cityName", cityName);
            long count = (long) query.getSingleResult();

            if (count == 0) {
                Cities city = new Cities();
                city.setName(cityName);
                city.setCountyID(cityPlateCode);
                entityManager.persist(city);
            }
        }
    }
}
