Function loadsecuritycams%()
    Local local0%
    sc_i = (New securitycaminstance)
    For local0 = $00 To $01 Step $01
        sc_i\Field4[local0] = loadtexture_strict((("GFX\Map\Textures\camera(" + (Str (local0 + $01))) + ").png"), $01, $01, 1.0)
    Next
    sc_i\Field3[$00] = loadmesh_strict("GFX\Map\Props\CamBase.b3d", $00, $01)
    sc_i\Field3[$01] = loadmesh_strict("GFX\Map\Props\CamHead.b3d", $00, $01)
    For local0 = $00 To $01 Step $01
        hideentity(sc_i\Field3[local0])
    Next
    sc_i\Field0 = createtextureusingcachesystem($200, $200, $401, $01, $01)
    Return $00
End Function
