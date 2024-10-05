package net.azizko.betterpotatoes.items;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;

public class FryItem extends Item {
    public FryItem(Properties pProperties){
        super(pProperties.food(Foods.BAKED_POTATO));
    }
}
