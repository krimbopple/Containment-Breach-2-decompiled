Function removemonitorinstances%()
    Local local0%
    For local0 = $00 To $01 Step $01
        freeentity(mon_i\Field3[local0])
        mon_i\Field3[local0] = $00
    Next
    For local0 = $00 To $11 Step $01
        mon_i\Field2[local0] = $00
    Next
    Delete mon_i
    mon_i = Null
    Return $00
End Function
