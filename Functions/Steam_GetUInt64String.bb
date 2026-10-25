Function Steam_GetUInt64String%(arg0%)
    Local local0.TX2BF6X0FF4
    Local local1%
    Local local2%
    local0 = TXXF6F02DB2[arg0]
    If (local0 = Null) Then
        local0 = GUESSEDcreateint(arg0, $00, $00)
        local0\Field19 = blitz_TX488420F440()
        local0\Field49 = blitz_TX488420F440()
        local0\Field26 = blitz_TX488420F440()
        local0\Field3 = blitz_TX28D20DD080()
        local0\Field29 = blitz_XXXBBZ4F2Z0()
        local0\Field44\Field7 = local0\Field29
    Else
        blitz_TB0B4Z68800($0F)
    EndIf
    If (blitz_TX28D20DD080() <> 0) Then
        local0\Field19 = 0.0
        local0\Field49 = 0.0
        local0\Field26 = 0.0
    EndIf
    local1 = blitz_T20024FDF4X0()
    local2 = blitz_T20024FDF4X0()
    Steam_GetUInt64(local0, _Steam_GetUInt64String(local1, local2))
    GUESSEDsettx_3(local0)
    local0\Field27 = blitz_T2X820D0FD0()
    GUESSEDsetfdf(local0)
    local0\Field32 = blitz_T20024FDF4X0()
    GUESSEDcheckvalue_23(local0)
    Return $00
End Function
