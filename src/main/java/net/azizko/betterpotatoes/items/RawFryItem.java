package net.azizko.betterpotatoes.items;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;

public class RawFryItem extends Item {
    public RawFryItem(Properties pProperties){
        super(pProperties.food(Foods.POISONOUS_POTATO));
    }
}
