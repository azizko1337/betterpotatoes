package net.azizko.betterpotatoes.items;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;

public class CrispsItem extends Item {
    public CrispsItem(Properties pProperties){
        super(pProperties.food(Foods.COOKED_BEEF));
    }
}
