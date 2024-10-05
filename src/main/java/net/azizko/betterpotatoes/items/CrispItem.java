package net.azizko.betterpotatoes.items;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;

public class CrispItem extends Item{
    public CrispItem(Properties pProperties){
        super(pProperties.food(Foods.BAKED_POTATO));
    }

}
