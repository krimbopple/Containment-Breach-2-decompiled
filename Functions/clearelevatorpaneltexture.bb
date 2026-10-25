Function clearelevatorpaneltexture%(arg0.doors)
    Local local0%
    For local0 = $00 To $01 Step $01
        If (arg0\Field24[local0] <> $00) Then
            entitytexture(arg0\Field24[local0], d_i\Field2[$02], $00, $00)
            GUESSEDfreeentity_7(arg0\Field24[local0], $FFFFFFFF, $00)
        EndIf
    Next
    arg0\Field4 = $00
    Return $00
End Function
