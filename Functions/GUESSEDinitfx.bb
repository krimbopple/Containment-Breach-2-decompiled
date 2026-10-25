Function GUESSEDinitfx%()
    Local local0%
    Local local1%
    local0 = graphicswidth()
    local1 = graphicsheight()
    GUESSEDfreetex()
    If (XX6BFZ60D4 = $00) Then
        XX6BFZ60D4 = GUESSEDgeteffect("GFX\Shaders\PostEffects\Bloom.fx", "", $01)
    EndIf
    If (TX2Z2D0X2 = $00) Then
        TX2Z2D0X2 = GUESSEDgeteffect("GFX\Shaders\PostEffects\Present.fx", "", $01)
    EndIf
    If (TFDDBF2FBF = $00) Then
        TFDDBF2FBF = GUESSEDgeteffect("GFX\Shaders\PostEffects\SSAO.fx", "", $01)
    EndIf
    If (XF8D2FBB4Z = $00) Then
        XF8D2FBB4Z = GUESSEDgeteffect("GFX\Shaders\PostEffects\FXAA.fx", "", $01)
    EndIf
    If (TXBF2840D48 = $00) Then
        TXBF2840D48 = GUESSEDgeteffect("GFX\Shaders\PostEffects\MotionBlur.fx", "", $01)
    EndIf
    If (XFZFZZ0B62 = $00) Then
        XFZFZZ0B62 = GUESSEDgeteffect("GFX\Shaders\PostEffects\Fog.fx", "", $01)
    EndIf
    If (TXF460XZDBD = $00) Then
        TXF460XZDBD = GUESSEDgeteffect("GFX\Shaders\Deferred\ReflectionProbe.fx", "", $01)
    EndIf
    If (Y04X2Z0F6F = $00) Then
        Y04X2Z0F6F = GUESSEDgeteffect("GFX\Shaders\PostEffects\BlendProbes.fx", "", $01)
    EndIf
    If (Y08D62XFDD = $00) Then
        Y08D62XFDD = GUESSEDgeteffect("GFX\Shaders\PostEffects\BilateralBlur.fx", "", $01)
    EndIf
    XZ40D084Z4 = $00
    Return $00
End Function
