Function GUESSEDsettx_3%(arg0.TX2BF6X0FF4)
    Local local0.EZZ00XD2
    Local local1%
    Local local2%
    Local local3#
    Local local4#
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    local0 = arg0\Field55
    local1 = blitz_TX28D20DD080()
    local2 = blitz_TX28D20DD080()
    local3 = blitz_TX488420F440()
    local4 = blitz_TX488420F440()
    local5 = blitz_T20024FDF4X0()
    arg0\Field41 = $00
    If (local5 > $00) Then
        GUESSEDpositiontx(local5, arg0\Field13)
        arg0\Field41 = $01
    EndIf
    local6 = $00
    local6 = (local6 + ((local0\Field21 <> local1) Lor (local0\Field16 <> local2)))
    local6 = (local6 + ((local3 <> local0\Field6) Lor (local4 <> local0\Field18)))
    If (local6 > $00) Then
        GUESSEDcheckvalue_19(arg0, local1, $00)
        local0\Field6 = local3
        local0\Field16 = local2
        local0\Field18 = local4
        GUESSEDfreeentity_6(arg0)
    EndIf
    For local7 = $00 To $09 Step $01
        local8 = blitz_XXXBBZ4F2Z0()
        local9 = blitz_XXXBBZ4F2Z0()
        GUESSEDcheckvalue_46(arg0, local7, local8, Null, local9)
    Next
    Return $00
End Function
