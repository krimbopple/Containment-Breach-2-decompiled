Function loadmisc%()
    Local local0%
    misc_i = (New miscinstance)
    misc_i\Field6[$00] = loadrmesh("GFX\Map\mt1.rmesh", Null, $01)
    misc_i\Field6[$01] = loadrmesh("GFX\Map\mt2.rmesh", Null, $01)
    misc_i\Field6[$02] = loadrmesh("GFX\Map\mt2C.rmesh", Null, $01)
    misc_i\Field6[$03] = loadrmesh("GFX\Map\mt3.rmesh", Null, $01)
    misc_i\Field6[$04] = loadrmesh("GFX\Map\mt4.rmesh", Null, $01)
    misc_i\Field6[$05] = loadrmesh("GFX\Map\mt2_elevator.rmesh", Null, $01)
    misc_i\Field6[$06] = loadrmesh("GFX\Map\mt1_generator.rmesh", Null, $01)
    For local0 = $00 To $06 Step $01
        hideentity(misc_i\Field6[local0])
    Next
    misc_i\Field4 = loadmesh_strict("GFX\Items\cup_liquid.b3d", $00, $01)
    entityfx(misc_i\Field4, $20)
    YX2D2860X(misc_i\Field4, $00, $10040)
    hideentity(misc_i\Field4)
    misc_i\Field5 = loadmesh_strict("GFX\Map\Props\save_screen.b3d", $00, $01)
    hideentity(misc_i\Field5)
    misc_i\Field3 = loadmesh_strict("GFX\Items\error.b3d", $00, $01)
    scaleentity(misc_i\Field3, 0.5, 0.5, 0.5, $00)
    hideentity(misc_i\Field3)
    For local0 = $00 To $01 Step $01
        misc_i\Field0[local0] = loadtexture_strict((("GFX\Particles\light(" + (Str local0)) + ").png"), $01, $01, 1.0)
    Next
    misc_i\Field1 = loadtexture_strict("GFX\Particles\advanced_light.png", $01, $01, 1.0)
    misc_i\Field2 = loadmesh_strict("GFX\Map\Props\lightcone.b3d", $00, $01)
    hideentity(misc_i\Field2)
    Return $00
End Function
