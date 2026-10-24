Function TXBF4X2Z8FX%()
    Local local0%
    For local0 = $01 To $F0 Step $01
        If (TXXF6F02DB2[local0] = Null) Then
            Return local0
        EndIf
    Next
    Return $00
    Return $00
End Function
