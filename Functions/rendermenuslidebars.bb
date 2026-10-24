Function rendermenuslidebars%()
    Local local0.menuslidebar
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    local1 = imageheight(blinkmeterimg)
    resizeimage(blinkmeterimg, imagewidth(blinkmeterimg), (Int ((Float local1) * 1.4)))
    For local0 = Each menuslidebar
        local2 = $FF
        local3 = $FF
        local4 = $FF
        color(local2, local3, local4, $FF)
        renderframe(local0\Field3, local0\Field0, (Int ((Float local0\Field2) + (14.0 * menuscale))), imageheight(blinkmeterimg), $00, $00, $00, $01)
        ebx_0018 = (Int (((((Float local0\Field2) * local0\Field5) / 100.0) + (Float local0\Field3)) + (3.0 * menuscale)))
        drawblock(blinkmeterimg, local0\Field0, $00, $00)
        If (mouseon(local0\Field3, local0\Field0, (Int ((Float local0\Field2) + (14.0 * menuscale))), imageheight(blinkmeterimg)) <> 0) Then
            color($64, $64, $64, $20)
            rect(local0\Field3, local0\Field0, ebx_0018, imageheight(blinkmeterimg), $01)
        EndIf
        color($AA, $AA, $AA, $FF)
        setfontex(XD00026ZX2\Field0[$00])
        If (local0\Field4 <> 0) Then
            textex((Int ((Float local0\Field3) - (50.0 * menuscale))), (Int ((Float local0\Field0) + (5.0 * menuscale))), getlocalstring("options", "slider.low"), $00, $00)
            textex((Int ((Float (local0\Field3 + local0\Field2)) + (34.0 * menuscale))), (Int ((Float local0\Field0) + (5.0 * menuscale))), getlocalstring("options", "slider.high"), $00, $00)
        EndIf
    Next
    resizeimage(blinkmeterimg, imagewidth(blinkmeterimg), local1)
    Return $00
End Function
