Function updatecheckpointmonitors%(arg0%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    local4 = mon_i\Field3[$01]
    local5 = countsurfaces(local4)
    For local0 = $02 To local5 Step $01
        local1 = getsurface(local4, local0)
        local2 = getsurfacebrush(local1)
        If (local2 <> $00) Then
            local3 = getbrushtexture(local2, $00)
            If (local3 <> $00) Then
                If (lower(strippath(texturename(local3))) <> "monitortexture.jpg") Then
                    If (50.0 > mon_i\Field0[($01 - arg0)]) Then
                        brushtexture(local2, mon_i\Field2[$01], $01, $00)
                        TZXZZ288XZ(local2, $FFFFFFFF, $01)
                    Else
                        brushtexture(local2, mon_i\Field2[$01], (arg0 Shl $01), $00)
                        TZXZZ288XZ(local2, $FFFFFFFF, (arg0 Shl $01))
                    EndIf
                    paintsurface(local1, local2)
                    freetexture(local3)
                    local3 = $00
                    freebrush(local2)
                    local2 = $00
                    Exit
                EndIf
                freetexture(local3)
                local3 = $00
            EndIf
            freebrush(local2)
            local2 = $00
        EndIf
    Next
    local1 = $00
    local4 = $00
    mon_i\Field1[($01 - arg0)] = $01
    Return $00
End Function
