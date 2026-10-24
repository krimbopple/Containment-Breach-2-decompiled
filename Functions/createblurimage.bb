Function createblurimage%()
    Local local0%
    Local local1%
    arkblurcam = createpivot($00)
    moveentity(arkblurcam, 0.0, 0.0, 10000.0, $00)
    hideentity(arkblurcam)
    local0 = createmesh(arkblurcam)
    local1 = createsurface(local0, $00)
    addvertex(local1, -1.0, 1.0, 0.0, 0.0, 0.0, 1.0)
    addvertex(local1, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0)
    addvertex(local1, -1.0, -1.0, 0.0, 0.0, 1.0, 1.0)
    addvertex(local1, 1.0, -1.0, 0.0, 1.0, 1.0, 1.0)
    addtriangle(local1, $00, $01, $02)
    addtriangle(local1, $03, $02, $01)
    entityfx(local0, $11)
    scaleentity(local0, (smallest_power_two / graphicwidthfloat), (smallest_power_two / graphicwidthfloat), 1.0, $00)
    positionentity(local0, 0.0, 0.0, 1.0001, $00)
    entityorder(local0, $FFFE7960)
    entityblend(local0, $01)
    arkblurimage = local0
    arkblurtexture = createtextureusingcachesystem((Int smallest_power_two), (Int smallest_power_two), $501, $01, $01)
    entitytexture(local0, arkblurtexture, $00, $00)
    Return $00
End Function
