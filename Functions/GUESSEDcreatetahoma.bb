Function GUESSEDcreatetahoma%(arg0.TX2BF6X0FF4)
    Local local0%
    For local0 = $00 To $05 Step $01
        arg0\Field43[local0] = (New XZBB2222DZ)
    Next
    GUESSEDcheckvalue_33(arg0, $00, "Tahoma")
    GUESSEDcheckvalue_42(arg0, $00, 0.213, 0.026)
    GUESSEDcheckvalue_49(arg0, $00, 0.8)
    GUESSEDcheckvalue_37(arg0, $00, GUESSEDpackbytes($B4, $B4, $B4), GUESSEDpackbytes($B4, $B4, $B4))
    GUESSEDcheckvalue_33(arg0, $01, "Icons")
    GUESSEDcheckvalue_42(arg0, $01, 0.213, 0.026)
    GUESSEDcheckvalue_49(arg0, $01, 0.86)
    GUESSEDcheckvalue_37(arg0, $01, GUESSEDpackbytes($B4, $B4, $B4), GUESSEDpackbytes($B4, $B4, $B4))
    GUESSEDcheckvalue_33(arg0, $02, "Tahoma")
    GUESSEDcheckvalue_42(arg0, $02, 0.0852, 0.0104)
    GUESSEDcheckvalue_49(arg0, $02, 0.84)
    GUESSEDcheckvalue_37(arg0, $02, GUESSEDpackbytes($B4, $B4, $B4), GUESSEDpackbytes($B4, $B4, $B4))
    Return $00
End Function
