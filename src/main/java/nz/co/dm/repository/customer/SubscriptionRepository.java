package nz.co.dm.repository.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import nz.co.dm.model.subscription.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}
