Function initfastresize%()
    resizetexture = createtexture((Int max(smallest_power_two, 2048.0)), (Int max(smallest_power_two, 2048.0)), $503, $01)
    loadmissingtexture()
    Y0B82FDB6F = createpivot($00)
    clscolor($00, $00, $00, $FF)
    GUESSEDwritefx()
    GUESSEDinitfx()
    Return $00
End Function
