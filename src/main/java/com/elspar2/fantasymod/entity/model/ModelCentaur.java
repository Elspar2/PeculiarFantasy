package com.elspar2.fantasymod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelCentaur extends ModelBase {
    public ModelRenderer CowBody;
    public ModelRenderer CowUdder;
    public ModelRenderer CowRearLeftLeg;
    public ModelRenderer CowFrontLeftLeg;
    public ModelRenderer CowRearRightLeg;
    public ModelRenderer CowFrontRightLeg;
    public ModelRenderer VillagerHead;
    public ModelRenderer VillagerRightBicep;
    public ModelRenderer VillagerLeftBicep;
    public ModelRenderer VillagerConnectedArms;
    public ModelRenderer VillagerBody;
    public ModelRenderer VillagerRobes;
    public ModelRenderer VillagerNose;

    public ModelCentaur() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.CowFrontRightLeg = new ModelRenderer(this, 0, 16);
        this.CowFrontRightLeg.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.CowFrontRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.CowRearLeftLeg = new ModelRenderer(this, 0, 16);
        this.CowRearLeftLeg.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.CowRearLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.VillagerConnectedArms = new ModelRenderer(this, 40, 38);
        this.VillagerConnectedArms.setRotationPoint(0.0F, -11.0F, -5.0F);
        this.VillagerConnectedArms.addBox(-4.0F, 2.0F, -2.0F, 8, 4, 4, 0.0F);
        this.setRotateAngle(VillagerConnectedArms, -0.7499679795819634F, 0.0F, 0.0F);
        this.CowRearRightLeg = new ModelRenderer(this, 0, 16);
        this.CowRearRightLeg.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.CowRearRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.VillagerRobes = new ModelRenderer(this, 0, 38);
        this.VillagerRobes.setRotationPoint(0.1F, -14.0F, -4.0F);
        this.VillagerRobes.addBox(-4.0F, 0.0F, -3.0F, 8, 18, 6, 0.5F);
        this.VillagerHead = new ModelRenderer(this, 0, 0);
        this.VillagerHead.setRotationPoint(0.1F, -14.0F, -4.0F);
        this.VillagerHead.addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, 0.0F);
        this.VillagerLeftBicep = new ModelRenderer(this, 44, 22);
        this.VillagerLeftBicep.setRotationPoint(0.0F, -11.0F, -5.0F);
        this.VillagerLeftBicep.addBox(4.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(VillagerLeftBicep, -0.7499679795819634F, 0.0F, 0.0F);
        this.VillagerBody = new ModelRenderer(this, 16, 20);
        this.VillagerBody.setRotationPoint(0.0F, -14.0F, -4.0F);
        this.VillagerBody.addBox(-4.0F, 0.0F, -3.0F, 8, 12, 6, 0.0F);
        this.CowFrontLeftLeg = new ModelRenderer(this, 0, 16);
        this.CowFrontLeftLeg.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.CowFrontLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.CowUdder = new ModelRenderer(this, 52, 0);
        this.CowUdder.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.CowUdder.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(CowUdder, 1.5707963267948966F, 0.0F, 0.0F);
        this.VillagerRightBicep = new ModelRenderer(this, 44, 22);
        this.VillagerRightBicep.setRotationPoint(0.0F, -11.0F, -5.0F);
        this.VillagerRightBicep.addBox(-8.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(VillagerRightBicep, -0.7499679795819634F, 0.0F, 0.0F);
        this.VillagerNose = new ModelRenderer(this, 24, 0);
        this.VillagerNose.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.VillagerNose.addBox(-1.0F, -1.0F, -6.0F, 2, 4, 2, 0.0F);
        this.CowBody = new ModelRenderer(this, 18, 4);
        this.CowBody.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.CowBody.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(CowBody, 1.5707963267948966F, 0.0F, 0.0F);
        this.VillagerHead.addChild(this.VillagerNose);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.CowFrontRightLeg.render(f5);
        this.CowRearLeftLeg.render(f5);
        this.VillagerConnectedArms.render(f5);
        this.CowRearRightLeg.render(f5);
        this.VillagerRobes.render(f5);
        this.VillagerHead.render(f5);
        this.VillagerLeftBicep.render(f5);
        this.VillagerBody.render(f5);
        this.CowFrontLeftLeg.render(f5);
        this.CowUdder.render(f5);
        this.VillagerRightBicep.render(f5);
        this.CowBody.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
