Function F48FF0BDZ%()
    Local local0%
    Local local1%
    local0 = graphicswidth()
    local1 = graphicsheight()
    T2XXF6D8B68()
    If (XX6BFZ60D4 = $00) Then
        XX6BFZ60D4 = T2B0ZBDBDB("GFX\Shaders\PostEffects\Bloom.fx", "", $01)
    EndIf
    If (TX2Z2D0X2 = $00) Then
        TX2Z2D0X2 = T2B0ZBDBDB("GFX\Shaders\PostEffects\Present.fx", "", $01)
    EndIf
    If (TFDDBF2FBF = $00) Then
        TFDDBF2FBF = T2B0ZBDBDB("GFX\Shaders\PostEffects\SSAO.fx", "", $01)
    EndIf
    If (XF8D2FBB4Z = $00) Then
        XF8D2FBB4Z = T2B0ZBDBDB("GFX\Shaders\PostEffects\FXAA.fx", "", $01)
    EndIf
    If (TXBF2840D48 = $00) Then
        TXBF2840D48 = T2B0ZBDBDB("GFX\Shaders\PostEffects\MotionBlur.fx", "", $01)
    EndIf
    If (XFZFZZ0B62 = $00) Then
        XFZFZZ0B62 = T2B0ZBDBDB("GFX\Shaders\PostEffects\Fog.fx", "", $01)
    EndIf
    If (TXF460XZDBD = $00) Then
        TXF460XZDBD = T2B0ZBDBDB("GFX\Shaders\Deferred\ReflectionProbe.fx", "", $01)
    EndIf
    If (Y04X2Z0F6F = $00) Then
        Y04X2Z0F6F = T2B0ZBDBDB("GFX\Shaders\PostEffects\BlendProbes.fx", "", $01)
    EndIf
    If (Y08D62XFDD = $00) Then
        Y08D62XFDD = T2B0ZBDBDB("GFX\Shaders\PostEffects\BilateralBlur.fx", "", $01)
    EndIf
    XZ40D084Z4 = $00
    Return $00
End Function
