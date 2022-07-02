package Interfaces.Repository;

import Model.Subscription;
import Repository.SubscriptionRepository;

import java.util.List;

public interface ISubscriptionRepository {
    void create(Subscription subscription);
    void update(Subscription subscription);
    List<Subscription> findAll();
    Subscription findByBuyer(String buyerId);
    Subscription findById(int id);
}
