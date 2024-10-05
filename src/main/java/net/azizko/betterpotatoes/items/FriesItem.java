package net.azizko.betterpotatoes.items;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;

public class FriesItem extends Item {
    public FriesItem(Properties pProperties){
        super(pProperties.food(Foods.COOKED_BEEF));
    }
}
