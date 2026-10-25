Function GUESSEDsetentry%(arg0%)
    Local local0%
    Local local1.T402X2Z846
    local0 = $00
    For local1 = Each T402X2Z846
        If ((local1\Field8 And (local1\Field10 = arg0)) <> 0) Then
            TXX0F66ZBZF[local0] = local1
            local0 = (local0 + $01)
            If (local0 >= $3E8) Then
                Exit
            EndIf
        EndIf
    Next
    TXX0F66ZBZF[local0] = Null
    Return local0
    Return $00
End Function
