package p.sda.shop.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

/*
Na pracę domową dokończyć klasę Cart tak aby działała sensownie tzn.
Do kosza możemy dodać 1 produkt, potem dodać jeszcze raz ten sam produkt i to zwiększy
ilość o 1, dodać inny produkt, dodać kilka innych lub tych samych produktów.
 */

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {

    List<CartItem> items;

    public Cart() {
        items = new ArrayList<>();
        items.add(new CartItem(1,"Wodka", 5));

    }

    public void addItemToCart(Product cartItem) {
        //items.add(cartItem);
    }

    public void addItemToCart(Product cartItem, int quantity) {
        //items.add(cartItem);
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void cleanCart() {
        items.clear();
    }
}
