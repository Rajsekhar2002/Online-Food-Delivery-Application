package in.sudhansu.foodiesapi.service;

import in.sudhansu.foodiesapi.io.CartRequest;
import in.sudhansu.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
