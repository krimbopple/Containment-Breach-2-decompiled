Function TX6BB60B482%(arg0.rooms, arg1.rooms)
    Local local0%
    Local local1%
    If ((((arg0 = arg1) Lor (arg0 = Null)) Lor (arg1 = Null)) <> 0) Then
        Return $01
    EndIf
    For local0 = $00 To $03 Step $01
        If (arg1\Field29[local0] <> Null) Then
            If (((arg1\Field29[local0] = arg0) And XBFZ664B8Z(arg1\Field29[local0])) <> 0) Then
                Return $01
            EndIf
            For local1 = $00 To $03 Step $01
                If (((arg1\Field29[local0]\Field29[local1] = arg0) And XBFZ664B8Z(arg1\Field29[local0]\Field29[local1])) <> 0) Then
                    Return $01
                EndIf
            Next
        EndIf
    Next
    Return $00
    Return $00
End Function
