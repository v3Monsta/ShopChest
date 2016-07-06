package de.epiceric.shopchest.event;

import de.epiceric.shopchest.shop.Shop;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class ShopBuySellEvent extends ShopEvent implements Cancellable {
    private Player player;
    private Shop shop;
    private Type type;
    private boolean cancelled;

    public ShopBuySellEvent(Player player, Shop shop, Type type) {
        this.player = player;
        this.shop = shop;
        this.type = type;
    }

    @Override
    public Shop getShop() {
        return shop;
    }

    public Type getType() {
        return type;
    }

    @Override
    public Player getPlayer() {
        return player;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        cancelled = b;
    }

    public enum Type {
        BUY,
        SELL;
    }
}
