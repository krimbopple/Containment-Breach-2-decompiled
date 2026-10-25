Function update035label%(arg0%)
    Local local0.itemtemplates
    Local local1.items
    Local local2%
    Local local3%
    Local local4$
    Local local5$
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10$
    Local local11%
    local11 = countsurfaces(arg0)
    If (i_035\Field0 <> 0) Then
        local5 = "035_sad"
    Else
        local5 = "035_smile"
    EndIf
    local4 = (("GFX\Map\Textures\label" + local5) + ".png")
    local2 = loadtexture_strict(local4, $01, $00, 1.0)
    entitytexture(arg0, local2, $00, $00)
    deletesingletextureentryfromcache(local2, $00)
    local2 = $00
    For local0 = Each itemtemplates
        If (local0\Field19 = "Document SCP-035") Then
            If (local0\Field25 <> $00) Then
                freeimage(local0\Field25)
                local0\Field25 = $00
            EndIf
            local0\Field2 = (("GFX\Items\HUD Textures\doc_" + local5) + ".png")
            local0\Field25 = scaleimageex(loadimage_strict(local0\Field2), menuscale, menuscale, $01)
            local0\Field3 = (imagewidth(local0\Field25) Sar $01)
            local0\Field4 = (imageheight(local0\Field25) Sar $01)
            local0\Field13 = local0\Field2
            For local1 = Each items
                If (local1\Field6\Field19 = local0\Field19) Then
                    local2 = getrescaledtexture(local0\Field13, $01, $100, $100, $00, $00)
                    entitytexture(local1\Field5, local2, $00, $00)
                    deletesingletextureentryfromcache(local2, $00)
                    local2 = $00
                    Exit
                EndIf
            Next
        EndIf
    Next
    freeimage(_S2IMapGet(achievementsimages, "035"))
    _S2IMapSet(achievementsimages, "035", scaleimageex(loadimage_strict((("GFX\Menu\achievements\Achv" + local5) + ".png")), menuscale, menuscale, $01))
    Return $00
End Function
