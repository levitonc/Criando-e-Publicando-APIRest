package me.carvalholevis.domain.model;

import java.util.List;




import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb-user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(cascade = jakarta.persistence.CascadeType.ALL)
    private Account account;
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    @OneToOne(cascade = jakarta.persistence.CascadeType.ALL)
    private Card card;

    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }

    @OneToMany(cascade = jakarta.persistence.CascadeType.ALL)
    private List<Feature> features;
    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    @OneToMany(cascade = jakarta.persistence.CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;    
    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }


    public User(Long id, String name, Account account, Card card, List<Feature> features, List<News> news) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.card = card;
        this.features = features;
        this.news = news;
    }

    
}
