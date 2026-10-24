Function FFZ262644%(arg0.rooms)
    Local local0%
    For local0 = $00 To $03 Step $01
        If (arg0\Field10[local0] <> Null) Then
            EXDFFFFD2(arg0\Field10[local0], 1.0)
        EndIf
    Next
    Return $00
End Function
