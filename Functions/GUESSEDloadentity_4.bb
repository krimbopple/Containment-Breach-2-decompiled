Function GUESSEDloadentity_4%()
    DZ64X028\Field62 = loadmesh_strict("GFX\Items\Weapons\trail.b3d", $00, $01)
    scaleentity(DZ64X028\Field62, 0.1, 0.1, 0.15, $00)
    entityalpha(DZ64X028\Field62, 0.0)
    Return $00
End Function
