Function GUESSEDcreatedoor%(arg0.doors)
    Local local0%
    For local0 = $01 To $3E7 Step $01
        If (Z22B2BXD2[local0] = Null) Then
            Z22B2BXD2[local0] = arg0
            arg0\Field36 = local0
            Exit
        EndIf
    Next
    Return $00
End Function
