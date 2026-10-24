Function TZF4ZFZ0ZF%(arg0%)
    Local local0%
    If (X4BX024DX0() = $00) Then
        Return $00
    EndIf
    FD020X0BZ\Field3 = (millisecs() + FD020X0BZ\Field4)
    If (FD020X0BZ\Field5 <> 0) Then
        If (X2Z260BF0Z\Field1[$0C] <> $00) Then
            freeentity(X2Z260BF0Z\Field1[$0C])
            X2Z260BF0Z\Field1[$0C] = $00
        EndIf
    EndIf
    FD020X0BZ\Field2 = 280.0
    If (arg0 <> 0) Then
        TXZF68824B()
    EndIf
    If (selecteddifficulty\Field10 <> $00) Then
        For local0 = $00 To (maxitemamount - $01) Step $01
            TX60DB8XBBZ(local0) = Null
        Next
    EndIf
    TX4F400F244 = Null
    TX0Z8FFZ8Z0(Null, Null, $00)
    Return $00
End Function
