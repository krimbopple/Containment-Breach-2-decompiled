Function GUESSEDcopychildren%(arg0%)
    Local local0%
    Local local1%
    Local local2%
    local0 = countchildren(arg0)
    For local1 = $01 To local0 Step $01
        local2 = getchild(arg0, local1)
        hideentity(local2)
        GUESSEDcopychildren(local2)
    Next
    Return $00
End Function
