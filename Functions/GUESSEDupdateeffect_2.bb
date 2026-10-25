Function GUESSEDupdateeffect_2%(arg0#, arg1%)
    Local local0.F4X4XZ2BZ
    If (((arg0 <> X6F6FZB0DD) Lor arg1) <> 0) Then
        X6F6FZB0DD = arg0
        For local0 = Each F4X4XZ2BZ
            If ((local0\Field0 And $80) <> 0) Then
                effectfloat(local0\Field1, "EnvBlendFactor", X6F6FZB0DD, $00)
            EndIf
        Next
    EndIf
    Return $00
End Function
