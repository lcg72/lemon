package com.mossle.asset.persistence.manager;

import com.mossle.asset.persistence.domain.AssetCategory;

import com.mossle.core.hibernate.HibernateEntityDao;

import org.springframework.stereotype.Service;

@Service
public class AssetCategoryManager extends HibernateEntityDao<AssetCategory> {
}
