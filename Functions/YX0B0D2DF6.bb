Function YX0B0D2DF6.T402X2Z846(arg0$, arg1%, arg2%)
    Local local0%
    Local local1$
    Local local2.T402X2Z846
    local0 = Z2XBX862F(arg0)
    If (local0 = $00) Then
        Return Null
    EndIf
    local1 = dottedip(local0)
    For local2 = Each T402X2Z846
        If (((((local2\Field10 = arg2) Lor ((local2\Field10 = $00) And (arg2 = $01))) And (local2\Field16 = arg1)) And (local2\Field29 = local1)) <> 0) Then
            Return Null
        EndIf
    Next
    local2 = (New T402X2Z846)
    local2\Field29 = local1
    local2\Field16 = arg1
    local2\Field11 = ((local1 + ":") + (Str arg1))
    local2\Field21 = "-"
    local2\Field6 = "-"
    local2\Field20 = $00
    local2\Field9 = $00
    local2\Field25 = $00
    local2\Field18 = $00
    local2\Field23 = ""
    local2\Field10 = arg2
    If (arg2 = $01) Then
        If (TD0F2FZBXZ(local2\Field29, local2\Field16, $00, $00) = $00) Then
            X0ZZ6X6ZD6(local2)
        EndIf
    ElseIf (Z2XBX862F(local2\Field29) = $00) Then
        X0ZZ6X6ZD6(local2)
    EndIf
    If (((arg2 = $02) Lor (arg2 = $03)) <> 0) Then
        XDFZF44Z8Z()
    EndIf
    Return local2
    Return Null
End Function
