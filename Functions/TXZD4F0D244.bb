Function TXZD4F0D244%(arg0%, arg1%)
    Local local0.T402X2Z846
    Local local1%
    local1 = $00
    For local0 = Each T402X2Z846
        If (((local0\Field10 = arg0) And (local0\Field8 Lor (arg1 = $00))) <> 0) Then
            local1 = (local1 + $01)
        EndIf
    Next
    Return local1
    Return $00
End Function
