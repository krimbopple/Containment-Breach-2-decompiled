Function Steam_GetAvatar%(arg0%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    If (arg0 = $00) Then
        Return $00
    EndIf
    _Steam_GetImageSize(arg0, local0, local1)
    If (((local0 > $00) And (local1 > $00)) <> 0) Then
        local2 = createimage(local0, local1, $01, $00)
        local3 = _Memory_Alloc(((local0 * local1) Shl $02))
        _Steam_GetImageRGBA(arg0, local3, ((local0 * local1) Shl $02))
        lockbuffer(imagebuffer(local2, $00))
        For local9 = $00 To (local1 - $01) Step $01
            For local10 = $00 To (local0 - $01) Step $01
                local4 = _Memory_PeekInt(((((local9 Shl $02) * local0) + (local10 Shl $02)) + local3))
                local5 = ((local4 Shr $18) And $FF)
                local8 = ((local4 Shr $10) And $FF)
                local7 = ((local4 Shr $08) And $FF)
                local6 = (local4 And $FF)
                writepixelfast(local10, local9, ((((local5 Shl $18) Or (local6 Shl $10)) Or (local7 Shl $08)) Or local8), imagebuffer(local2, $00))
            Next
        Next
        unlockbuffer(imagebuffer(local2, $00))
        _Memory_Dealloc(local3)
        Return local2
    EndIf
    Return $00
    Return $00
End Function
