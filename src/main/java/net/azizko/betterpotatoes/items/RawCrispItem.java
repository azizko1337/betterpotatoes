package net.azizko.betterpotatoes.items;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;

public class RawCrispItem extends Item {
    public RawCrispItem(Properties pProperties){
        super(pProperties.food(Foods.POISONOUS_POTATO));
    }
}
