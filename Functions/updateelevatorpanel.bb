Function updateelevatorpanel%(arg0.doors)
    Local local0%
    Local local1%
    local0 = ($01 - arg0\Field43)
    For local1 = $00 To $01 Step $01
        If (arg0\Field24[local1] <> $00) Then
            entitytexture(arg0\Field24[local1], d_i\Field2[local0], $00, $00)
            GUESSEDfreeentity_7(arg0\Field24[local1], $FFFFFFFF, $00)
        EndIf
    Next
    arg0\Field4 = $01
    Return $00
End Function
