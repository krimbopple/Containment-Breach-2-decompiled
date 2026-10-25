Function GUESSEDloadtex%(arg0$, arg1%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local5%
    local0 = loadtexture(arg0, $4001)
    If (local0 = $00) Then
        Return $00
    EndIf
    local1 = $00
    local2 = texturewidth(local0)
    local3 = $01
    Select opt\Field34
        Case $00
            local3 = $08
        Case $01
            local3 = $04
        Case $02
            local3 = $02
        Case $03
            local3 = $01
    End Select
    If (textureheight(local0) >= (local2 Sar $02)) Then
        local2 = (local2 Sar $02)
        local1 = createtexture((local2 / local3), (local2 / local3), (arg1 Or $08), $01)
        setcubeface(local1, $00)
        copyrectstretch((local2 * $00), local2, local2, local2, $00, $00, (local2 / local3), (local2 / local3), texturebuffer(local0, $00), texturebuffer(local1, $00))
        setcubeface(local1, $01)
        copyrectstretch((local2 Shl $00), local2, local2, local2, $00, $00, (local2 / local3), (local2 / local3), texturebuffer(local0, $00), texturebuffer(local1, $00))
        setcubeface(local1, $02)
        copyrectstretch((local2 Shl $01), local2, local2, local2, $00, $00, (local2 / local3), (local2 / local3), texturebuffer(local0, $00), texturebuffer(local1, $00))
        setcubeface(local1, $03)
        copyrectstretch((local2 * $03), local2, local2, local2, $00, $00, (local2 / local3), (local2 / local3), texturebuffer(local0, $00), texturebuffer(local1, $00))
        setcubeface(local1, $04)
        copyrectstretch((local2 Shl $00), (local2 * $00), local2, local2, $00, $00, (local2 / local3), (local2 / local3), texturebuffer(local0, $00), texturebuffer(local1, $00))
        setcubeface(local1, $05)
        copyrectstretch((local2 Shl $00), (local2 Shl $01), local2, local2, $00, $00, (local2 / local3), (local2 / local3), texturebuffer(local0, $00), texturebuffer(local1, $00))
    ElseIf (textureheight(local0) = (local2 / $06)) Then
        local2 = (local2 / $06)
        local1 = createtexture((local2 / local3), (local2 / local3), (arg1 Or $08), $01)
        setcubeface(local1, $00)
        copyrectstretch((local2 * $00), $00, local2, local2, $00, $00, (local2 / local3), (local2 / local3), texturebuffer(local0, $00), texturebuffer(local1, $00))
        setcubeface(local1, $03)
        copyrectstretch((local2 Shl $00), $00, local2, local2, $00, $00, (local2 / local3), (local2 / local3), texturebuffer(local0, $00), texturebuffer(local1, $00))
        setcubeface(local1, $02)
        copyrectstretch((local2 Shl $01), $00, local2, local2, $00, $00, (local2 / local3), (local2 / local3), texturebuffer(local0, $00), texturebuffer(local1, $00))
        setcubeface(local1, $01)
        copyrectstretch((local2 * $03), $00, local2, local2, $00, $00, (local2 / local3), (local2 / local3), texturebuffer(local0, $00), texturebuffer(local1, $00))
        setcubeface(local1, $04)
        copyrectstretch((local2 Shl $02), $00, local2, local2, $00, $00, (local2 / local3), (local2 / local3), texturebuffer(local0, $00), texturebuffer(local1, $00))
        setcubeface(local1, $05)
        copyrectstretch((local2 * $05), $00, local2, local2, $00, $00, (local2 / local3), (local2 / local3), texturebuffer(local0, $00), texturebuffer(local1, $00))
    Else
        local1 = createtexture((local2 / local3), (local2 / local3), (arg1 Or $08), $01)
        For local5 = $00 To $05 Step $01
            setcubeface(local1, local5)
            copyrectstretch($00, $00, local2, local2, $00, $00, (local2 / local3), (local2 / local3), texturebuffer(local0, $00), texturebuffer(local1, $00))
        Next
    EndIf
    freetexture(local0)
    Return local1
    Return $00
End Function
