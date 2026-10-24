Function loaddecals%()
    Local local0%
    de_i = (New decalinstance)
    For local0 = $00 To $01 Step $01
        de_i\Field0[local0] = loadtexture_strict((("GFX\Decals\corrosive_decal(" + (Str local0)) + ").png"), $03, $01, 1.0)
    Next
    For local0 = $02 To $07 Step $01
        de_i\Field0[local0] = loadtexture_strict((("GFX\Decals\blood_decal(" + (Str (local0 - $02))) + ").png"), $03, $01, 1.0)
    Next
    For local0 = $08 To $0D Step $01
        de_i\Field0[local0] = loadtexture_strict((("GFX\Decals\pd_decal(" + (Str (local0 - $08))) + ").png"), $03, $01, 1.0)
    Next
    For local0 = $0E To $10 Step $01
        de_i\Field0[local0] = loadtexture_strict((("GFX\Decals\bullet_hole_decal(" + (Str (local0 - $0E))) + ").png"), $03, $01, 1.0)
    Next
    For local0 = $11 To $12 Step $01
        de_i\Field0[local0] = loadtexture_strict((("GFX\Decals\blood_drop_decal(" + (Str (local0 - $11))) + ").png"), $03, $01, 1.0)
    Next
    de_i\Field0[$14] = loadtexture_strict("GFX\Decals\scp_409_decal.png", $03, $01, 1.0)
    de_i\Field0[$13] = loadtexture_strict("GFX\Decals\scp_427_decal.png", $03, $01, 1.0)
    de_i\Field0[$15] = loadtexture_strict("GFX\Decals\scp_999_decal.png", $03, $01, 1.0)
    de_i\Field0[$16] = loadtexture_strict("GFX\Decals\water_decal.png", $03, $01, 1.0)
    de_i\Field0[$17] = loadtexture_strict("GFX\Decals\cracked_glass_decal.png", $03, $01, 1.0)
    de_i\Field0[$18] = loadtexture_strict("GFX\Decals\foam_decal.png", $03, $01, 1.0)
    de_i\Field0[$19] = loadtexture_strict("GFX\Decals\explosion_decal.png", $03, $01, 1.0)
    Return $00
End Function
