Function loadmonitors%()
    Local local0%
    mon_i = (New monitorinstance)
    mon_i\Field2[$00] = loadtexture_strict("GFX\Overlays\monitor_overlay.png", $01, $01, 1.0)
    mon_i\Field2[$01] = loadanimtexture_strict("GFX\Map\Screens\screen_checkpoint_lockdown.png", $01, $400, $300, $00, $03, $01)
    mon_i\Field2[$02] = createtextureusingcachesystem($01, $01, $01, $01, $01)
    mon_i\Field2[$03] = loadanimtexture_strict("GFX\Overlays\scp_079_overlays_X.png", $01, $100, $100, $00, $0C, $01)
    mon_i\Field2[$04] = loadanimtexture_strict("GFX\Overlays\scp_079_overlays_ASCII.png", $01, $100, $100, $00, $06, $01)
    mon_i\Field2[$05] = loadanimtexture_strict("GFX\Overlays\scp_079_overlays.png", $01, $100, $100, $00, $06, $01)
    For local0 = $06 To $10 Step $01
        mon_i\Field2[local0] = loadtexture_strict((("GFX\Overlays\scp_895_overlay(" + (Str (local0 - $06))) + ").png"), $01, $01, 1.0)
    Next
    mon_i\Field2[$11] = loadtexture_strict("GFX\Map\Screens\screen_096.png", $01, $01, 1.0)
    mon_i\Field3[$00] = loadmesh_strict("GFX\Map\Props\monitor2.b3d", $00, $01)
    mon_i\Field3[$01] = loadmesh_strict("GFX\Map\Props\monitor_checkpoint.b3d", $00, $01)
    For local0 = $00 To $01 Step $01
        hideentity(mon_i\Field3[local0])
    Next
    Return $00
End Function
