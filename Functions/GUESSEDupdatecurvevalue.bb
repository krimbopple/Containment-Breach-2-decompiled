Function GUESSEDupdatecurvevalue%(arg0#)
    Local local0#
    Local local1#
    Local local2#
    Local local3#
    local0 = menuscale
    menuscale = (menuscale * arg0)
    local1 = ((Float (((-200.0 > XZ0260X8X2\Field42) * rand($FFFFFFFE, $02)) + $50)) * menuscale)
    local2 = (-400.0 * menuscale)
    local3 = (15.0 * menuscale)
    If ((((i_714\Field0 > $00) And (500.0 > remove714timer)) Lor ((T8660BZ460\Field10 > $00) And (500.0 > removehazmattimer))) <> 0) Then
        XF42DX80F4 = curvevalue(local1, XF42DX80F4, local3)
    Else
        XF42DX80F4 = curvevalue(local2, XF42DX80F4, local3)
    EndIf
    If (i_268\Field2 > $01) Then
        A8F8B0DF4 = curvevalue(local1, A8F8B0DF4, local3)
    Else
        A8F8B0DF4 = curvevalue(local2, A8F8B0DF4, local3)
    EndIf
    menuscale = local0
    Return $00
End Function
