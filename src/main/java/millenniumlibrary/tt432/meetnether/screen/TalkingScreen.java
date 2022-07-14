package millenniumlibrary.tt432.meetnether.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import com.mojang.math.Matrix4f;
import millenniumlibrary.tt432.meetnether.MeetNether;
import millenniumlibrary.tt432.meetnether.client.ClientTalkingHandler;
import millenniumlibrary.tt432.meetnether.menu.TalkingMenu;
import millenniumlibrary.tt432.meetnether.screen.base.BaseScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;

/**
 * @author DustW
 **/
public class TalkingScreen extends BaseScreen<TalkingMenu> {
    public static final ResourceLocation TALKING = new ResourceLocation(MeetNether.ID, "textures/gui/talking.png");

    public TalkingScreen(TalkingMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle, new ResourceLocation(MeetNether.ID, ""));

        width = Minecraft.getInstance().getWindow().getGuiScaledWidth();
        height = Minecraft.getInstance().getWindow().getGuiScaledHeight();

        imageHeight = height;
        imageWidth = imageHeight;
    }

    @Override
    public void render(PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick) {
        super.render(pPoseStack, pMouseX, pMouseY, pPartialTick);

        Entity talking = ClientTalkingHandler.talking;

        if (talking != null) {
            Minecraft mc = Minecraft.getInstance();
            Font font = mc.font;
            font.draw(pPoseStack, talking.getDisplayName(), leftPos + 16, topPos + 124, 0xFFFFFFFF);
        }
    }

    @Override
    protected void renderLabels(PoseStack pPoseStack, int pMouseX, int pMouseY) {
    }

    @Override
    protected void renderBg(PoseStack matrixStack, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.setShaderTexture(0, TALKING);
        innerBlit(matrixStack.last().pose(), leftPos, leftPos + imageWidth,
                topPos, topPos + imageHeight, 0, 0, 1, 0, 1);
    }

    private static void innerBlit(Matrix4f pMatrix, int pX1, int pX2, int pY1, int pY2, int pBlitOffset, float pMinU, float pMaxU, float pMinV, float pMaxV) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        BufferBuilder bufferbuilder = Tesselator.getInstance().getBuilder();
        bufferbuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX);
        bufferbuilder.vertex(pMatrix, (float)pX1, (float)pY2, (float)pBlitOffset).uv(pMinU, pMaxV).endVertex();
        bufferbuilder.vertex(pMatrix, (float)pX2, (float)pY2, (float)pBlitOffset).uv(pMaxU, pMaxV).endVertex();
        bufferbuilder.vertex(pMatrix, (float)pX2, (float)pY1, (float)pBlitOffset).uv(pMaxU, pMinV).endVertex();
        bufferbuilder.vertex(pMatrix, (float)pX1, (float)pY1, (float)pBlitOffset).uv(pMinU, pMinV).endVertex();
        bufferbuilder.end();
        BufferUploader.end(bufferbuilder);
    }
}
